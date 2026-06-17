## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Dynamic Tints for Disabled Icons in Jetpack Compose
**Learning:** When disabling an `IconButton` in Jetpack Compose, if the inner `Icon` has a custom `tint` applied, it does not automatically update to reflect the disabled visual state. The custom tint overrides the disabled color defaults.
**Action:** Always dynamically adjust the inner `Icon`'s `tint` parameter (e.g., using `if (enabled) customTint else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to ensure the user receives clear, immediate visual feedback that the interactive element is disabled.
