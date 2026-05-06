## 2026-05-06 - Jetpack Compose IconButton over clickable Icon
**Learning:** When adding click interactions to icons in Jetpack Compose, using `IconButton` is preferred over adding `Modifier.clickable` to an `Icon`. `IconButton` automatically handles minimum touch target sizing (48dp x 48dp) for accessibility and provides standard visual feedback (ripple effect) out of the box, ensuring compliance with Material Design guidelines.
**Action:** Use `IconButton` containing an `Icon` instead of `Icon` with `Modifier.clickable` for standalone icon interactions.
