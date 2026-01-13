class Solution {
public:
    double separateSquares(vector<vector<int>>& squares) {
        double low = 1e18, high = -1e18;
        double totalar = 0.0;

        for(int i=0;i<squares.size();i++){
            double y0 = squares[i][1];
            double side = squares[i][2];
            totalar += side * side;
            low = min(low, y0);
            high = max(high, y0 + side);
        }

        double target = totalar / 2.0;

        for(int iter=0; iter<60; iter++){   // precision loop
            double mid = (low + high) / 2.0;
            double areablow = 0.0;

            for(int k=0;k<squares.size();k++){
                double y0 = squares[k][1];
                double y1 = y0 + squares[k][2];
                double side = squares[k][2];

                if(mid <= y0) continue;
                else if(mid >= y1) areablow += side * side;
                else areablow += (mid - y0) * side;
            }

            if(areablow < target) low = mid;
            else high = mid;
        }
        return low;
    }
};
