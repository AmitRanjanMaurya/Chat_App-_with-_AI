## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Software Keyboard Interactions in Jetpack Compose
**Learning:** By default, Jetpack Compose `TextField`s do not optimize the software keyboard for chat or messaging scenarios, leading to a suboptimal UX where users must manually capitalize sentences and cannot trigger a "Send" action directly from the keyboard.
**Action:** Enhance `TextField` UX by configuring `KeyboardOptions` (e.g., `ImeAction.Send`, `KeyboardCapitalization.Sentences`) and `KeyboardActions` (with `LocalSoftwareKeyboardController` to hide the keyboard on send) to ensure intuitive software keyboard interactions.
