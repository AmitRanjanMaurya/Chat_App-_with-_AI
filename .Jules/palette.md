## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Enhancing Chat Inputs in Jetpack Compose
**Learning:**
1. `IconButton` components must have their inner `Icon`'s `tint` explicitly updated to reflect the disabled state (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`). They do not inherit the disabled alpha automatically when `enabled = false`.
2. TextFields used for chat or messaging should leverage `KeyboardOptions` (for sentence capitalization and IME Action) and `KeyboardActions` (to handle the IME send action and hide the keyboard) to provide a smooth, expected mobile UX.
**Action:** Always visually disable interactive components when their corresponding action is invalid (like an empty chat prompt). Configure software keyboard settings for expected behavior in chat/messaging fields.
