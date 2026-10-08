## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-10-08 - Visual Disabled State in Jetpack Compose
**Learning:** Disabling an `IconButton` in Jetpack Compose does not automatically change the `tint` of its inner `Icon` if a custom tint is hardcoded. The custom tint must be dynamically adjusted to reflect the disabled visual state.
**Action:** When dynamically disabling an `IconButton`, explicitly manage the inner `Icon`'s `tint` (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to ensure the user gets clear visual feedback that the action is unavailable.
