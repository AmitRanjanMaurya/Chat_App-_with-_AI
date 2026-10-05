## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-25 - Custom Tints and Disabled States in Jetpack Compose
**Learning:** When hardcoding a custom `tint` parameter on an `Icon` component inside an `IconButton`, the icon does not automatically reflect the disabled visual state when the parent `IconButton` is disabled.
**Action:** Always dynamically adjust the inner `Icon`'s `tint` parameter (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) when disabling an `IconButton` to provide clear, immediate user feedback.
