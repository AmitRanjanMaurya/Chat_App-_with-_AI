## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-28 - Jetpack Compose IconButton Custom Tint Disabled States
**Learning:** When providing a custom `tint` to an `Icon` inside an `IconButton` in Jetpack Compose, setting `enabled = false` on the `IconButton` does not automatically update the `Icon`'s tint to a disabled visual state.
**Action:** Always dynamically calculate and pass the tint color (e.g., `if (enabled) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to ensure disabled interactive elements provide clear visual feedback to users.
