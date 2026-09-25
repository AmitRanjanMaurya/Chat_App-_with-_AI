## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-06-03 - Disabled IconButton Visuals in Jetpack Compose
**Learning:** When an `IconButton` is disabled, its inner `Icon` does not automatically update its visual state if a hardcoded custom `tint` is provided. This can lead to users thinking the button is still active.
**Action:** Always dynamically adjust the `tint` parameter of the inner `Icon` (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) when disabling an `IconButton` with a custom tint.
