## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-06-09 - Visually disabling interactive elements
**Learning:** In Jetpack Compose, when you use `IconButton`, setting `enabled = false` stops clicks, but if you have a custom hardcoded `tint` on the inner `Icon`, it won't automatically look disabled. Users need visual feedback when actions are invalid (e.g., submitting an empty chat prompt).
**Action:** Always dynamically adjust the inner `Icon`'s `tint` parameter (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) based on the disabled state when inside an `IconButton`.
