## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-25 - Dynamically adjusting custom tints for disabled IconButtons in Jetpack Compose
**Learning:** When using custom tints for an `Icon` inside an `IconButton`, the disabled visual state is not automatically updated by the `IconButton`'s `enabled` parameter.
**Action:** When conditionally disabling an `IconButton` (e.g. for empty form submissions), dynamically adjust the inner `Icon`'s `tint` using `if (enabledCondition) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` to provide accurate visual feedback.
