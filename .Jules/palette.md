## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Dynamic Icon Tints for Disabled States in Jetpack Compose
**Learning:** When disabling an `IconButton` in Jetpack Compose, an inner `Icon` with a hardcoded custom tint parameter does not automatically reflect the expected disabled visual state (e.g., greyed out).
**Action:** Always dynamically adjust the inner `Icon`'s `tint` parameter based on the enabled state (e.g., using `if (enabled) customColor else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to ensure proper visual feedback and accessibility.

## 2024-05-24 - Enhancing Jetpack Compose TextFields for Forms/Chats
**Learning:** By default, standard Jetpack Compose `TextField`s do not auto-capitalize sentences or trigger a specific "Send" action on the soft keyboard, leading to poor UX for messaging applications.
**Action:** Configure `TextField` UX by defining `KeyboardOptions` (e.g., `imeAction = ImeAction.Send`, `capitalization = KeyboardCapitalization.Sentences`) and `KeyboardActions` (with `LocalSoftwareKeyboardController.current?.hide()`) to ensure intuitive software keyboard interactions.
