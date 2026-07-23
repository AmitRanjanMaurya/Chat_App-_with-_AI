## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-07-23 - Visual Feedback for Disabled Interactive Elements in Jetpack Compose
**Learning:** When disabling an `IconButton` in Jetpack Compose using the `enabled` parameter, the inner `Icon`'s `tint` does not automatically fade or update to reflect the disabled visual state if a custom hardcoded tint is applied. This creates a confusing UX where a button looks active but does nothing.
**Action:** Always dynamically adjust the `tint` parameter of the inner `Icon` (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) based on the disabled condition to provide clear, immediate visual feedback.
