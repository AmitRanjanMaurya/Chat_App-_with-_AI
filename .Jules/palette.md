## 2024-05-24 - Accessibility improvements for Jetpack Compose Icons
**Learning:** Standard `Icon` elements with `Modifier.clickable` lack proper accessibility semantics and touch targets compared to `IconButton` in Jetpack Compose.
**Action:** Use `IconButton` wrapping an `Icon` for interactive elements to ensure correct minimum touch targets, focus semantics, and visual feedback (ripple effect) for screen readers and touch users.
