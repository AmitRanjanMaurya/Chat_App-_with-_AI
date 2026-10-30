## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-10-24 - Visually Disabling Custom-Tinted Icons
**Learning:** In Jetpack Compose, when an `IconButton` is disabled, its internal `Icon` does not automatically reflect the disabled state if a custom `tint` is hardcoded.
**Action:** Always dynamically adjust the `tint` parameter (e.g., `if (enabled) primary else onSurface.copy(alpha = 0.38f)`) when disabling an `IconButton` with a custom icon color to ensure clear visual feedback.
