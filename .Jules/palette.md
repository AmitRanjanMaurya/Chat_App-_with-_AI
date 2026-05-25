## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-25 - Disabled State Visibility in Jetpack Compose
**Learning:** In Jetpack Compose, explicitly setting the `tint` of an `Icon` component overrides the default visual disabled alpha provided by a wrapping `IconButton`.
**Action:** When conditionally disabling an `IconButton`, ensure the inner `Icon`'s `tint` is dynamically adjusted (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to correctly reflect the disabled visual state.
