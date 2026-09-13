## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled States for IconButtons in Jetpack Compose
**Learning:** When using an `IconButton` in Jetpack Compose and assigning a custom `tint` to its inner `Icon` (such as `MaterialTheme.colorScheme.primary`), the icon does not automatically update its color when the `IconButton` is disabled. This results in a disabled button that still looks active, causing confusing UX.
**Action:** When customizing the `tint` of an `Icon` inside an `IconButton`, dynamically adjust the color based on the `enabled` state. Use `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` to correctly represent the visually disabled state.
