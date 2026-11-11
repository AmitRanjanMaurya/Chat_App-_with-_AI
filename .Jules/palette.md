## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled State for IconButton
**Learning:** `IconButton` components do not automatically change the tint of their inner `Icon` when the `enabled` parameter is set to false if a custom tint is provided to the `Icon`.
**Action:** When providing a custom tint to an `Icon` inside an `IconButton`, dynamically change the tint based on the enabled state (e.g., `if (isEnabled) activeColor else disabledColor`) to ensure clear visual feedback.
