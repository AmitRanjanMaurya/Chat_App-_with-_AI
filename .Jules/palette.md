## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-25 - Disabled States for IconButtons in Compose
**Learning:** Hardcoding a custom primary tint on an `Icon` inside an `IconButton` overrides default Compose behavior and prevents the icon from visually adopting a disabled state.
**Action:** When conditionally disabling an `IconButton`, dynamically adjust the inner `Icon`'s `tint` parameter based on the enabled state (e.g., `if (enabled) primary else onSurface.copy(alpha = 0.38f)`) to ensure clear, immediate visual feedback.
