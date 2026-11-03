## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Visual State for Disabled IconButtons
**Learning:** Hardcoded icon tints in Jetpack Compose (e.g., setting a static `MaterialTheme.colorScheme.primary` on an `Icon` inside an `IconButton`) do not automatically respond to the `enabled` state of the parent button, leaving users confused about why an interactive element isn't responding.
**Action:** When conditionally disabling an `IconButton`, always dynamically update the child `Icon`'s `tint` using `if (enabled) defaultColor else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` to ensure clear visual feedback.
