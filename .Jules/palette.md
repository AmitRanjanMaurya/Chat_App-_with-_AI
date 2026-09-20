## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disable Submit Buttons on Empty Input
**Learning:** Interactive UI elements like a Send button should be visually disabled when the action is invalid (e.g., submitting an empty chat prompt) to provide clear, immediate user feedback.
**Action:** Always verify inputs and use the `enabled` state of buttons, dynamically adjusting visual indicators like `tint` using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` to clearly signal the disabled state.
