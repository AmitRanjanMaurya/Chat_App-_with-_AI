## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Custom Tint in Disabled IconButton
**Learning:** When using a custom tint on an `Icon` inside an `IconButton`, the `IconButton`'s disabled state does not automatically gray out the inner `Icon`. The disabled color logic only works correctly out of the box when using default theme colors or managing the state manually.
**Action:** When manually setting an `Icon`'s tint inside an `IconButton`, explicitly manage the disabled visual state by adjusting the tint based on the enabled condition (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` when disabled).
