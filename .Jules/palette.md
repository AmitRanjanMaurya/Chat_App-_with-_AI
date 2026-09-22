## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled State Styling for Custom Tinted Icons
**Learning:** When explicitly setting a custom `tint` on an `Icon` inside an `IconButton` in Jetpack Compose, the built-in disabled visual state is lost. You must manually adjust the `tint` based on the `enabled` state to provide clear visual feedback to the user.
**Action:** When adding `enabled = false` to an `IconButton` with a custom tinted `Icon`, conditionally set the inner `Icon`'s tint (e.g., `if (enabled) customColor else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`).
