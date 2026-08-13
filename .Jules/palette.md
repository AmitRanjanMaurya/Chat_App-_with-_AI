## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Visually Disabling Custom Tinted Icons
**Learning:** When using custom tints for an `Icon` inside an `IconButton` in Jetpack Compose, the `Icon` does not automatically inherit a visually disabled state (like low opacity) when the parent `IconButton` is disabled.
**Action:** When disabling an `IconButton`, always remember to explicitly manage the inner `Icon`'s `tint` parameter based on the enabled state (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` for the disabled tint).
