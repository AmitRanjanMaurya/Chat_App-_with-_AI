## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Visual feedback for disabled actions in Jetpack Compose
**Learning:** Hardcoded icon tints in Jetpack Compose (e.g. `tint = MaterialTheme.colorScheme.primary`) do not automatically respond when the parent `IconButton` is disabled. This leads to a confusing UX where interactive elements appear active even when their actions are blocked (like trying to send an empty message).
**Action:** Always verify that visual properties (like `tint` or `alpha`) dynamically reflect the `enabled` state of interactive components. Use `.copy(alpha = 0.38f)` on a semantic color (like `onSurface`) to represent the disabled visual state.
