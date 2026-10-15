## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Visual Disabled States for Icons in Jetpack Compose
**Learning:** Hardcoded custom tints on `Icon` components inside an `IconButton` do not automatically inherit the parent's disabled visual state, even when `enabled = false` is set on the button.
**Action:** Always dynamically adjust the `tint` parameter of the inner `Icon` (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to provide clear visual feedback when an interactive element is disabled.
