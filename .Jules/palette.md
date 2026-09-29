## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Dynamic Icon Tinting for Disabled States in Jetpack Compose
**Learning:** When assigning a custom `tint` color to an `Icon` inside an `IconButton`, the built-in disabled alpha styling provided by `IconButton` is completely overridden.
**Action:** When conditionally disabling an `IconButton` (e.g., `enabled = false`), dynamically calculate the `Icon`'s `tint` parameter (e.g., `if (enabled) PrimaryColor else OnSurfaceColor.copy(alpha = 0.38f)`) to guarantee users receive clear visual feedback that the button is disabled.
