## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-10-16 - Dynamic Tints for Disabled IconButtons
**Learning:** When disabling an `IconButton` in Jetpack Compose, the `tint` parameter of the inner `Icon` component does not automatically adjust to a disabled visual state if a custom hardcoded tint is applied.
**Action:** Always dynamically calculate the inner `Icon` tint based on the `IconButton` enabled state (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)` for the disabled state) to ensure clear visual feedback to the user.
