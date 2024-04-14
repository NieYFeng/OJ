module.exports = function (api) {
  api.cache(true);

  const presets = ["@babel/preset-env"];
  const plugins = ["@babel/plugin-transform-class-static-block"];

  return {
    presets,
    plugins,
  };
};
