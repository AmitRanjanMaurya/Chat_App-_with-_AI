## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled States for Custom Tinted Icons
**Learning:** In Jetpack Compose, when overriding the `tint` parameter of an `Icon` inside an `IconButton`, the icon does not automatically reflect the `IconButton`'s disabled state.
**Action:** When setting an `IconButton` to disabled, dynamically adjust the inner `Icon`'s `tint` (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to ensure the disabled state is visually communicated to users.
