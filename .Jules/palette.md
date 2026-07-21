## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-07-21 - Visual Feedback for Disabled IconButtons in Jetpack Compose
**Learning:** When disabling an `IconButton` in Jetpack Compose, the inner `Icon` component might not automatically reflect the disabled visual state if a custom tint is hardcoded. This can lead to a confusing UX where the button appears active but doesn't respond to interaction.
**Action:** When setting a custom `tint` on an `Icon` inside an `IconButton`, dynamically adjust the tint based on the `enabled` state (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` for disabled) to ensure clear visual feedback.
