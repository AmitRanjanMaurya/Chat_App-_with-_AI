## 2026-05-01 - Use IconButton instead of Icon with clickable modifier
**Learning:** Using an `Icon` with a `clickable` modifier lacks built-in accessibility features like minimum touch targets (48x48dp) and standard focus semantics, as well as the standard visual ripple feedback expected on Android/Compose.
**Action:** Always prefer `IconButton` when creating interactive icon buttons in Jetpack Compose to ensure proper accessibility and visual feedback automatically.
