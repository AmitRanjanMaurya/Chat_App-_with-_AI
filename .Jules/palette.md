## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Dynamic Tinting for Disabled Icons in Jetpack Compose
**Learning:** Hardcoded custom icon tints in Jetpack Compose do not automatically adapt to reflect `IconButton` disabled states, which can cause confusion since users might still perceive the button as active.
**Action:** When conditionally disabling an `IconButton`, explicitly manage the child `Icon`'s `tint` (e.g., `if (enabled) color else color.copy(alpha = 0.38f)`) to provide consistent and intuitive visual feedback for disabled interactions.
