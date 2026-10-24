## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled State Styling for Custom Tinted Icons
**Learning:** When using an `IconButton` in Jetpack Compose, setting `enabled = false` disables the interaction, but if the inner `Icon` has a hardcoded custom `tint`, it will not automatically update to a visually disabled state (grayed out).
**Action:** When manually tinting an `Icon` inside an `IconButton`, always conditionally adjust the `tint` based on the enabled state (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` for the disabled state) to ensure clear visual feedback.
