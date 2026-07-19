## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Visual Disabled States and Custom Tints
**Learning:** In Jetpack Compose, when dynamically disabling an `IconButton` to provide better user feedback (e.g., when a form is empty), custom inner `Icon` tints do not automatically update to reflect the disabled state. This can leave the UI looking active even when interactions are blocked.
**Action:** When manually setting a custom `tint` on an `Icon` inside an `IconButton`, always ensure the tint is updated conditionally to reflect the `enabled` state (e.g., `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` for disabled).
