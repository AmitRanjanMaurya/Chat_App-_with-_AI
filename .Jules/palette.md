## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-09-08 - Disabled States for Interactive Elements
**Learning:** When disabling an `IconButton` in Jetpack Compose, the inner `Icon`'s `tint` does not automatically update to reflect the disabled state if a custom tint is applied.
**Action:** Always dynamically adjust the `tint` parameter of the inner `Icon` based on the `enabled` state of the wrapping `IconButton` (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to provide clear visual feedback.
