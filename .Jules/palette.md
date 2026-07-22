## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Visual State for Disabled IconButtons
**Learning:** When using custom tints for an `Icon` inside an `IconButton` in Jetpack Compose, the tint does not automatically update to reflect the `enabled` state of the `IconButton`. Hardcoded custom colors remain visually active even when the button is functionally disabled.
**Action:** When setting `enabled` on an `IconButton` based on state, dynamically adjust the inner `Icon`'s `tint` parameter (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` for disabled) to ensure clear, immediate visual feedback that the action is invalid.
