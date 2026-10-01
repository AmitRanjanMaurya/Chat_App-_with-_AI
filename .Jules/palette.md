## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Visually Disabled State for Custom-Tinted Icons
**Learning:** When disabling an `IconButton` in Jetpack Compose, dynamically adjust the inner `Icon`'s `tint` parameter (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`), as hardcoded custom tints do not automatically reflect the disabled visual state.
**Action:** Always verify that interactable components not only have functional disabled states (using `enabled = false`) but also provide clear visual feedback by dynamically adjusting color/tinting properties to indicate they cannot be interacted with.
