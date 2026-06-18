## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-06-18 - Jetpack Compose IconButton Visual Feedback
**Learning:** In Jetpack Compose, setting `enabled = false` on an `IconButton` correctly disables interaction, but if the inner `Icon` has a hardcoded custom `tint` applied (like `MaterialTheme.colorScheme.primary`), it will *not* automatically reflect the disabled visual state (it stays primary-colored).
**Action:** When conditionally disabling an `IconButton` that uses a custom-tinted `Icon`, always dynamically update the `tint` parameter to match the visual state, typically using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` for the disabled appearance.
