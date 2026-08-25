## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled State Styling in Jetpack Compose
**Learning:** Hardcoding a custom tint on an `Icon` inside an `IconButton` overrides the default visual disabled state provided by Compose.
**Action:** When manually setting an `Icon`'s tint, dynamically adjust the color based on the enabled state (e.g., `onSurface.copy(alpha = 0.38f)` for disabled) to ensure clear visual feedback.
