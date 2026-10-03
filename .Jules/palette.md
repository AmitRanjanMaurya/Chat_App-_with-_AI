## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Dynamic Tinting for Disabled IconButtons
**Learning:** When explicitly providing a `tint` to an `Icon` inside an `IconButton`, the tint does not automatically update when the `IconButton`'s `enabled` state changes. The custom tint overrides the disabled visual state.
**Action:** When providing a custom tint to an `Icon` inside an `IconButton`, always dynamically evaluate the `enabled` state and adjust the tint color accordingly (e.g., `if (enabled) customColor else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`).
