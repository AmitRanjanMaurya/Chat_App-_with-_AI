## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.## 2024-05-24 - Disabled State Styling
**Learning:** In Jetpack Compose, hardcoded tints on Icons override the automatic dimming provided by a disabled IconButton. We must dynamically adjust the tint when disabling components.
**Action:** Always check inner Icon tint parameters when implementing `enabled` states on IconButtons to ensure visual feedback matches interaction state.
