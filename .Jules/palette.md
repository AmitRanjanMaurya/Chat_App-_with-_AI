## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-07-29 - Visually Disable Action Buttons in Jetpack Compose
**Learning:** When a form or input requires text to be submitted, the submission button (e.g., Send `IconButton`) should be disabled when the input is empty to provide immediate user feedback. Hardcoded icon tints in `IconButton` do not automatically update based on the enabled state.
**Action:** Always bind the `enabled` state of `IconButton` to the input validation logic and dynamically adjust the inner `Icon`'s `tint` using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` when disabled.
