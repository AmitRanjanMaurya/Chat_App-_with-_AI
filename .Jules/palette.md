## 2026-05-02 - Prefer IconButton over Modifier.clickable on Icon
**Learning:** In Jetpack Compose, using `Modifier.clickable` on an `Icon` component strips away built-in accessibility features like minimum touch targets, focus semantics, and visual feedback (ripple effect) which are essential for a good user experience.
**Action:** Always wrap interactive icons in an `IconButton` component instead of applying `Modifier.clickable` directly to the `Icon`.
