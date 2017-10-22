const gulp = require("gulp");
const sass = require("gulp-sass");
const watch = require("gulp-watch");
const plumber = require('gulp-plumber');
const del = require('del');

const variables = {
    src: {
        scss: ['src/main/scss/**/*.{scss,css}'],
        font: ['node_modules/font-awesome/fonts/*'],
    },
    dest: {
        stylesheets: 'src/main/resources/static/stylesheets',
        font: 'src/main/resources/static/fonts',
    }
};

/* sass tasks */
gulp.task("sass:build", () => gulp.src(variables.src.scss)
    .pipe(sass())
    .pipe(gulp.dest(variables.dest.stylesheets)));

gulp.task("sass:watch", () => gulp.src(variables.src.scss)
    .pipe(watch(variables.src.scss))
    .pipe(plumber())
    .pipe(sass())
    .pipe(gulp.dest(variables.dest.stylesheets)));

/* font tasks */
gulp.task("font:build", () => gulp.src(variables.src.font)
    .pipe(gulp.dest(variables.dest.font)));

/* clean tasks */
gulp.task("clean", del.bind(null, [variables.dest.stylesheets, variables.dest.font]));

/* combined tasks */
gulp.task("build", ["sass:build", "font:build"]);