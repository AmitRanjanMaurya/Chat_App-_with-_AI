## 2024-05-24 - Accessible Interactive Icons in Jetpack Compose
**Learning:** Using `Modifier.clickable` on an `Icon` component in Jetpack Compose does not automatically provide the necessary minimum touch target size (48x48dp) or visual feedback (like a ripple effect) required for good accessibility and UX.
**Action:** Always prefer wrapping `Icon` components with an `IconButton` when they are meant to be interactive. `IconButton` built-in defaults satisfy accessibility touch targets and provide focus semantics and ripple effects out of the box.
## 2024-05-24 - Disabled Interactive Elements Visual State in Jetpack Compose
**Learning:** When disabling an `IconButton` in Jetpack Compose that has a custom-tinted inner `Icon`, the visual "disabled" state doesn't automatically apply to the inner `Icon`. The tint must be manually and dynamically adjusted (e.g., using `MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)`) to provide clear visual feedback to the user.
**Action:** Always ensure interactive elements visually reflect their disabled state, especially when overriding default colors, to provide clear and immediate feedback on when an action is unavailable.
