## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-10-27 - Disabled State for Invalid Actions
**Learning:** Hardcoded custom tints on interactive elements like `Icon` do not automatically reflect a disabled visual state when the parent `IconButton` is disabled. Also, allowing form submission with whitespace-only inputs is poor UX.
**Action:** Use `isNotBlank()` for text validation to enable/disable submit buttons. Dynamically adjust the inner `Icon`'s `tint` (e.g., `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to explicitly communicate the disabled state.
