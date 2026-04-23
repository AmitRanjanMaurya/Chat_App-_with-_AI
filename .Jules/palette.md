## 2026-04-23 - Proper Touch Targets and Focus States
**Learning:** Custom icon buttons using a simple `Modifier.clickable` on an `Icon` lack proper minimum touch targets and focus states required for accessibility.
**Action:** Always prefer the framework's built-in `IconButton` component which automatically handles these necessary interactive and accessibility features (minimum touch size, ripple feedback, focus semantics) over ad-hoc clickable images or icons.
