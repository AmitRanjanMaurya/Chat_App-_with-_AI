## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled State for IconButtons with Custom Tints
**Learning:** When using custom tints for `Icon` components inside an `IconButton`, the disabled state of the `IconButton` does not automatically fade the inner `Icon`. The tint must be manually adjusted based on the `enabled` state (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to provide clear visual feedback that the action is unavailable.
**Action:** Always dynamically calculate the `Icon` tint based on the `enabled` state of its parent `IconButton` when overriding the default tint, ensuring users immediately understand when an action is blocked.
