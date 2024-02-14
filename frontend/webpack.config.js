import path from 'path';

export default {
  entry: './src/seguimiento-citas.js',
  output: {
    filename: './src/main/resources/static/built/bundle.js',
    path: __dirname,
  },
  module: {
    rules: [
      {
        test: path.join(__dirname, '.'),
        exclude: /node_modules/,
        use: {
          loader: 'babel-loader',
          options: {
            "presets": ["@babel/preset-env"]
          }
        },
      },
    ],
  },
};
