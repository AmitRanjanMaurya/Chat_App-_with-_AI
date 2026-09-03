## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled State Visibility for Custom Tints
**Learning:** When using custom color tints (like `MaterialTheme.colorScheme.primary`) on an `Icon` inside an `IconButton`, the `Icon` does not automatically update its tint to reflect the disabled state of the parent button, leading to a confusing UX where a disabled button looks clickable.
**Action:** Always dynamically adjust the `Icon`'s `tint` parameter based on the enabled state (e.g., using `if (enabled) customColor else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to ensure the visual state correctly communicates interactivity to the user.
