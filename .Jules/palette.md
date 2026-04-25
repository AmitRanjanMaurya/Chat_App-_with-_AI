## 2026-04-25 - Use IconButton instead of Icon with Modifier.clickable
**Learning:** In Jetpack Compose, using `Modifier.clickable` directly on an `Icon` lacks essential accessibility features and visual feedback. It does not provide the minimum recommended touch target size (48x48dp) by default, and it misses proper focus semantics for screen readers and visual ripple effects.
**Action:** Always prefer the built-in `IconButton` composable for icon-only interactive elements to ensure accessibility compliance and standard visual feedback.
