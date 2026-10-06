## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-10-06 - Disabled state for empty prompt submissions
**Learning:** In Jetpack Compose, an `IconButton` disabled state doesn't automatically propagate to its internal `Icon`'s `tint` property, which can lead to misleading UX where a button looks active but is unresponsive.
**Action:** Always dynamically adjust the inner `Icon`'s `tint` parameter using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` when the button is disabled to provide clear, immediate user feedback.
