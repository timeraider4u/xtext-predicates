// example similiar to the one found in the linux kernel
#define __ARG_FOO_1 0,
#define BAR_ENABLED(foo1) _BAR_ENABLED(foo1)
#define _BAR_ENABLED(foo2) __BAR_ENABLED(__ARG_FOO_##foo2)
#define __BAR_ENABLED(foo3_or_junk) ___BAR_ENABLED(foo3_or_junk 1, 0)
#define ___BAR_ENABLED(__ignored, foo4, ...) foo4
#define BAR_ENABLED2(foo1) _BAR_ENABLED2(foo1)
#define _BAR_ENABLED2(foo2) __BAR_ENABLED2(__ARG_FOO_##foo2)
#define BAR_ENABLED3(foo1) _BAR_ENABLED3(foo1)
#define _BAR_ENABLED3(foo2) __BAR_ENABLED3(foo2##__ARG_FOO_)

int i = BAR_ENABLED(FOO);
#define FOO 1
int j = BAR_ENABLED(FOO);
#undef FOO
#define FOO
int k = BAR_ENABLED2(FOO);
int l = BAR_ENABLED(FOO);
int m = BAR_ENABLED3(FOO);
