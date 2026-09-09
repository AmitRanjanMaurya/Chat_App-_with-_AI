## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-27 - Disabled State for Interactive Elements
**Learning:** Interactive elements like a Send button should be visually disabled when the action is invalid (e.g., submitting an empty prompt with no image). This provides immediate visual feedback to the user and prevents unnecessary interactions or errors.
**Action:** Always dynamically adjust the `enabled` parameter of `IconButton` and visually indicate the state by adjusting the inner `Icon`'s `tint` parameter using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` for the disabled state.
