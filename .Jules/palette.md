## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Dynamic Tinting for Disabled State of IconButtons
**Learning:** When creating a disabled state for an `IconButton` that uses a custom `tint` color on its inner `Icon`, the `tint` color needs to be dynamically adjusted based on the `enabled` state. It doesn't automatically fall back to the disabled visual appearance unless properly configured (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`).
**Action:** When implementing custom-colored `Icon`s inside `IconButton`s, always bind the `tint` property to the component's `enabled` state.
